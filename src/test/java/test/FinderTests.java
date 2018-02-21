package test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import algorithm.Pair;
import algorithm.FT;
import algorithm.Finder;
import algorithm.Person;

public class FinderTests {

	private Person sue = new Person("Sue", new Date(50, 0, 1));
	private Person greg = new Person("Greg", new Date(52, 5, 1));
	private Person sarah = new Person("Sarah", new Date(82, 0, 1));
	private Person mike = new Person("Mike", new Date(79, 0, 1));

	@Test
	public void Returns_Empty_Results_When_Given_Empty_List() {
		List<Person> list = new ArrayList<Person>();
		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Closest);
		assertEquals(null, result.onePerson);

		assertEquals(null, result.anotherPerson);
	}

	@Test
	public void Returns_Empty_Results_When_Given_One_Person() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);

		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Closest);

		assertEquals(null, result.onePerson);
		assertEquals(null, result.anotherPerson);
	}

	@Test
	public void Returns_Closest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(greg);
		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Closest);

		assertEquals(sue, result.onePerson);
		assertEquals(greg, result.anotherPerson);
	}

	@Test
	public void Returns_Furthest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(mike);
		list.add(greg);

		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Furthest);

		assertEquals(greg, result.onePerson);
		assertEquals(mike, result.anotherPerson);
	}

	@Test
	public void Returns_Furthest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);
		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Furthest);

		assertEquals(sue, result.onePerson);
		assertEquals(sarah, result.anotherPerson);
	}

	@Test
	public void Returns_Closest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);

		Finder finder = new Finder(list);

		Pair result = finder.Find(FT.Closest);

		assertEquals(sue, result.onePerson);
		assertEquals(greg, result.anotherPerson);
	}

}
