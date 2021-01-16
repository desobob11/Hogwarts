/**
 * Factory
 * Author @Desmond O'Brien
 *
 * Initializes NPC and Zone Objects
 * Adds objects into designated ArrayLists
 * Returns ArrayLists to the Application Class
 */

import java.util.*;
import java.io.*;

public class Factory {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Zone> zoneList = new ArrayList<Zone>();
    private ArrayList<Professor> professorList = new ArrayList<Professor>();
    private ArrayList<House> houseList = new ArrayList<House>();



    public House createHouse() {
        return new House();
    }

    public Zone createZone() {
        return new Zone();
    }

    public Professor createProfessor() {
        return new Professor();
    }

    public Student createStudent() {
        return new Student();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Zone> gteZoneList() {
        return zoneList;
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void createHouseList() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "C:/Users/Des/Documents/GitHub/Hogwarts2/text/HouseNames.txt"));
        ArrayList<String> names = new ArrayList<String>();

        String line = br.readLine();
        while(line != null) {
            line = br.readLine();
            names.add(line);
        }
            for (int i = 0; i <= names.size() - 1; i++) {
                houseList.add(createHouse());
            }
            for (int i = 0; i <= names.size() - 1; i++) {
                houseList.get(i).setName(names.get(i));
            }
            houseList.remove(houseList.size() - 1);
    }

    public void createStudentList(int num) {
        for (int i = 1; i <= num; i++) {
            studentList.add(createStudent());
        }
    }


    public ArrayList<Zone> initiateZones() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "C:/Users/Des/Documents/GitHub/Hogwarts2/text/Zones.txt"));
        ArrayList<String> names = new ArrayList<String>();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            names.add(line);
        }

        int numberOfNames = names.size() - 1;
        for (int i = 0; i <= numberOfNames; i++) {
            zoneList.add(createZone());
        }
        for (int i = 0; i <= numberOfNames; i++) {
            zoneList.get(i).setName(names.get(i));
        }
        zoneList.remove(zoneList.size()-1);
        return zoneList;
    }

    public void createProfessorList(int num) {
        for (int i = 1; i <= num; i++) {
            professorList.add(createProfessor());
        }
    }


    public void genderNPCs() {
        Random ran = new Random();
        for (NPC student: studentList) {
            student.setGender(ran.nextInt(2));
        }
        for (NPC prof: professorList) {
            prof.setGender(ran.nextInt(2));
        }
    }


    public void nameNPCs() throws IOException {
        for (NPC student: studentList) {
            student.createName();
        }
        for (NPC prof: professorList) {
            prof.createName();
        }
    }


    public void initiateNPCS(int numOf) throws IOException {
        createStudentList(numOf);
        createProfessorList(numOf);
        genderNPCs();
        nameNPCs();
    }

    public void initiateHouses() throws IOException {
        createHouseList();
    }
}
