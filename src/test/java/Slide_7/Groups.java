package Slide_7;

import org.testng.annotations.Test;

public class Groups {
	// Adding different names group 
	// Next to each @test we write the group nane
	// In the xml file, create group tag under test level, inside the group, we add <run tag, inside we put
	// <include name=" group name">, then all groups with that name will only run  
	//Can add many groups so that all with the name run
	//Spelling of group name must be accurate so it runs
	// Can do include or exclude to no longer run for example
	// Exclude more powerful than include, means that if group has a name that it should exclude and a name that it should include
	// It won't run because of exclude
	//There are regular expression in groups, which can be added before the group name, such as windows is regular expression, meaning
	// executing it in windows. These name can be put in the xml file, similarly to the group names. 
	// Metagroups are under group in xml file but before run, with tag <define
  @Test (groups= {"windows.smoke"})
  public void Group_1() {
  }
  @Test (groups= {"smoke", "sanity"})
  public void Group_2() {
  }
  @Test(groups= {"regression", "sanity"})
  public void Group_3() {
  }
  @Test(groups= {"regression"})
  public void Group_4() {
  }
}
