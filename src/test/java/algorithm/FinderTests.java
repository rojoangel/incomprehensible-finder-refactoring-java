package algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static algorithm.SamplePerson.*;

public class FinderTests {

	@Test
	public void Returns_Empty_Results_When_Given_Empty_List() {
		List<Person> list = new ArrayList<Person>();
		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(), result);
	}

	@Test
	public void Returns_Empty_Results_When_Given_One_Person() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);

		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(), result);
	}

	@Test
	public void Returns_Closest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(greg);
		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(sue, greg), result);
	}

	@Test
	public void Returns_Furthest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(mike);
		list.add(greg);

		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Furthest);

		assertEquals(new Pair(greg, mike), result);
	}

	@Test
	public void Returns_Furthest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);
		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Furthest);

		assertEquals(new Pair(sue, sarah), result);
	}

	@Test
	public void Returns_Closest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);

		Finder finder = new Finder(list);

		Pair result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(sue, greg), result);
	}

}
