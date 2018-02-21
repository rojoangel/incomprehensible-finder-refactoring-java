package algorithm;

import algorithm.result.Empty;
import algorithm.result.Pair;
import algorithm.result.Result;
import org.junit.Test;

import static algorithm.SamplePerson.*;
import static org.junit.Assert.assertEquals;

public class FinderTests {

	@Test
	public void Returns_Empty_Results_When_Given_Empty_List() {
		People people = new People();
		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Closest);

		assertEquals(new Empty(), result);
	}

	@Test
	public void Returns_Empty_Results_When_Given_One_Person() {
		People people = new People();
		people.add(sue);
		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Closest);

		assertEquals(new Empty(), result);
	}

	@Test
	public void Returns_Closest_Two_For_Two_People() {
		People people = new People();
		people.add(sue);
		people.add(greg);
		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(sue, greg), result);
	}

	@Test
	public void Returns_Furthest_Two_For_Two_People() {
		People people = new People();
		people.add(mike);
		people.add(greg);

		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Furthest);

		assertEquals(new Pair(greg, mike), result);
	}

	@Test
	public void Returns_Furthest_Two_For_Four_People() {
		People people = new People();
		people.add(sue);
		people.add(sarah);
		people.add(mike);
		people.add(greg);
		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Furthest);

		assertEquals(new Pair(sue, sarah), result);
	}

	@Test
	public void Returns_Closest_Two_For_Four_People() {
		People people = new People();
		people.add(sue);
		people.add(sarah);
		people.add(mike);
		people.add(greg);

		Finder finder = new Finder(people);

		Result result = finder.Find(Algorithm.Closest);

		assertEquals(new Pair(sue, greg), result);
	}

}
