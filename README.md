# Project 2 Another Type of Employee

## Introduction
The files *Firm.java, staff.java, staffMember.java, Volunteer.java, Employee.java, Executive.java* and *Hourl.java* illustrates inheritance and polymorphism. 
In this project, you will add one more employee type to the class hierarchy.
The employee will be one that is an hourly employee but also earns a commission on sales. 
Hence the class, which we'll name *Commission*, will be derived from the *Hourly* class.

## Getting Started on the Project
1. Download the GitHub Repository as Zip file.
2. Unzip the file to the desired location.
3. Open the project in IntelliJ to start programming
    - If you are at the initial screen on IntelliJ, click **Open** in the top right corner and select the downloaded folder
    - If you have another project opened, click **File** -> **Open** in the top left corner and select the downloaded folder

## What you need to do

1. Write a class named *Commission* with the following features:
   1. It extends the Hourly class.
   2. It has two instance variables (in addition to those inherited): one is the total sales the employee has made (type double)
      and the second is the commission rate for the employee (the commission rate will be type double and will represent
      the percent (in decimal form) commission the employee earns on sales (so .2 would mean the employee earns 20% commission on sales)).
   3. The constructor takes 6 parameters: the first 5 are the same as for Hourly (name, address, phone number, social security
      number, hourly pay rate) and the 6th is the commission rate for the employee. The constructor should call the constructor 
      of the parent class with the first 5 parameters then use the 6th to set the commission rate.
   4. One additional method is needed: public void addSales (double totalSales) that adds the parameter to the instance
      variable representing total sales.
   5. The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the
      pay from commission on sales. (See the pay method in the Executive class.) The total sales should be set back to 0 
      (note: you don't need to set the hoursWorked back to 0—why not?).
   6. The toString method needs to call the toString method of the parent class then add the total sales to that.
2. To test your class, update *Staff.java* as follows
   1. Increase the size of the array to 8.
   2. Add two commissioned employees to the staffList—make up your own names, addresses, phone numbers and social
      security numbers. Have one of the employees earn $6.25 per hour and 20% commission and the other one earn $9.75 per
      hour and 15% commission.
   3. For the first additional employee you added, put the hours worked at 35 and the total sales $400; for the second, put the
      hours at 40 and the sales at $950. 
3. Compile and run the program. Make sure it is working properly.