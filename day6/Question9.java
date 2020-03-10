package com.capgemini.quiz.day6;

abstract class Question9 {

    String my_name;
    String myName(){
          my_name = "Examveda";
          return my_name;
    };
    abstract void display();
}
class MMM extends Question9 {
	void display(){
        String n = myName();
    System.out.print("My name is "+ n);
  }

  public static void main(String args[]){
	  Question9 t = new MMM();
    t.display();
  }


}