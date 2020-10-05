# Lab3
CISC 3130 Lab#3

This repository was created to display my source code, input and output of the third lab assignment for the course CISC 3130. The assignment was to read data from a text file that was given from a record label executive in CSV format of a weekly report containing the top streamed music artists on Spotify Charts, and to process this list of information and report the artists who appeared on the top streamed list in alphabetical order using linked lists.

# Installation
These are the instructions on how to run my program/code, as well as the description of the technologies I used.

## Dependencies/Technologies
* Java 8 IDE (Netbeans 8.2) https://netbeans.org/downloads/8.2/rc/

NetBeans is is a free and open source integrated development environment (IDE) for Java. It runs on Windows, macOS, Linux and Solaris operating systems. I used this IDE to create/compile/run my program. As well as created my text file and integrated the CSV file from Spotify Charts https://spotifycharts.com/regional/global/weekly/latest

## Setup/Instructions
These are the steps to compile ReportLab3.java and run the program ReportLab3. Source code is found in the src/report folder and the CSV file is called regional-global-weekly-latest.csv. These steps are for use with command line workflow such as terminal.

1. Sign up for a GitHub account if you don't have one. Set up your SSH keys with github.
2. Clone this repository to your machine to get a copy.
3. Move into the project's root directory with cd lab3
4. Move again into the subdirectory src/reportlab3 using the command cd src/reportlab3
5. Compile the java file using the java compiler command javac ReportLab3.java
5. Run the compiled java program with the java command java ReportLab3

The output should be the same as the output text file: ArtistsSorted-Weekof09032020.txt

## Folder Structure
* Source Code is saved into the src/reportlab3 folder, as well as the node (Artist.java) and the linked list (TopStreamingArtists.java).
* Data is called regional-global-weekly-latest.csv which is saved into the ReportLab3 folder.
* Output is called ArtistsSorted-Weekof09032020.txt which is saved into the ReportLab3 folder.
