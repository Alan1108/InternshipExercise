# InternshipExercise

## 1. Overview
###### The solution I created was from separation of strings in substrings and save in to a class with every component, this means that I make smaller strings to manage in a better way the data.

## 2. Architecture
###### The architecture of the solution is a program and a .txt file, so the program opens de file and obtain the data, after that this data is formatted and saved in the model classes. 
###### The architecture goes as follows
![Architecture](/Architecture.png)

## 3. Approach and Methodology 
## 3.1. Approach
###### The approach of the solution was to see the input data as a jigsaw puzzle that can split in to little pieces to identify the different atributes that I need to solve the excercise.
## 3.2. Methodology
###### The methodology that I aplied was obtain the string data from the .txt file the split in to pieces and save this pieces in differente classes, the name in Employee and all the time of each employee in a class called Time, I did this to have a better manage of the data and compare in a better way the schedules, once It was obtained the data and saved in the corresponding classes, after this I compare the day, to ensure that is the same schedule day of the two employees, and check in and check out hours, in the solution I compare the check in hour of the first employee and the check out hour of the second employee and the check out of the first employee and the check in hour of the second employee, if the check in hour of the first employee is less than or iqual to the check out hour of the second one and, the check out hour of the first one is greater than or iqual to the check in hour of the second one, this means that the both employees coincided in the office.

## 4. Instructions to run the solution
## 4.1. If you have Netbeans IDE
###### 4.1.1. Download the github repository
###### 4.1.2. Open Netbeans IDE
###### 4.1.3. Once you open it go to the section "File" in the top of the screen and click it
###### 4.1.4. Click the option "Open Project ..."
###### 4.1.5. After this will open a new window with a File Searcher, here you have to search the root directory where you downloaded the repository and It will appear an icon of a cup of coffe with the name "InternshipExcercise", double click in the name and the project will open.
###### 4.1.6.Once the project was open it to run it you have to click in the play green icon that appear in the top of the IDE window, this will open a console with the result in a little window
## 4.2. If you have Java installed but not Netbeans IDE
###### 4.2.1 Download the github repository
###### 4.2.2. Go to the folder \InternshipExcercise\dist 
###### 4.2.3. Open a console in this directory
###### 4.2.4. Finally execute this command in the console:
```
java -jar InternshipExcercise.jar
```
