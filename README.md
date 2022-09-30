# ICPJavaIndividualProject2022

Angel Manzi Gaju, 72052024 
Intermediate Computer programming course
Individual Project 1
Dr. Dr. David Ebo Adjepon-Yamoah and Owusu-Banahene Osei
September 30th, 2022

Background of this project;

This project applies all of the fundamentals we learned in java, such as defining classes, fields, constructors,
methods in Java, and error handling. It employs the appropriate types, such as collections and justified data
structures. Implement fundamental algorithms and technologies. As a project, it also demonstrates how to use
Javadoc to document your program solution.
Introduction (project specification)
A database of airports, airlines, and routes is provided. This project aims to create a program that, given a start
city (e.g., Accra, Ghana) and a destination city (e.g., Winnipeg, Canada), outputs a series of flights that move a
person from the start city to the destination city. The program should determine a valid path between the two
cities.


Methodology(Problem analysis and solution design)

Using the csv files provided, I had to find a correlation between them and how to link them up. Therefore, I
started by analyzing the information given; we were supposed to enter the user's source country and city and also
their destination country and city. Looking at the csv files, I could only find this information in the Airport.csv
file, so I started with that. After getting the user details and filtering out the airports in the country and city that
the user is currently in, and the country and city they are going to. After which, I save this information in an
ArrayList. I then checked how I could use this information to find the route, and after delegation, I realized the
route.csv file had a column for source airport ID and destination airport ID. Therefore, I looped through the
ArrayList of the airports I had saved and got their airport IDs. Finally, I looped through the route.csv file and
compared the two columns (source airport ID and destination airport ID); if any returned true, it meant there was
a route between both cities. Therefore, I saved them into another ArrayList. After which, I then looped through
this ArrayList to get the number of stops, and per the size of the ArrayList, that will be the total number of routes
from the source to the destination country. For the total number of stops, I looped through the ArrayList and
found the sum of all the stops.


Conclusion (lessons learnt from the project)

For the solution, the program is able to take a two-line input file (start and the destination countries and cities),
process it, and create the result in a three-line output file (a numbered list of flights, total number of flights
needed, and the total number of additional stops made on those flights).
This project allowed me to develop my fundamental java skills and prepared me for future programming
difficulties(any programming problem is possible). A worthwhile individual project assisted me in providing
practical exposure that served me to improve my problem-solving, critical thinking, research, and analysis
abilities.


Acknowledgment

This is to thank everyone who contributed to making this project a reality. First and foremost, I want to thank my
CS professor, Dr. David Ebo Adjepon-Yamoah, and our devoted FI, Owusu-Banahene Osei, who provided
invaluable assistance, committed their time to teach the java principles, and helped us comprehend how to
complete this project.
The internet search was also quite helpful, and I ultimately consulted some instructors and my seniors—God
bless them.
