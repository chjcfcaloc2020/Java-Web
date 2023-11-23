package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controller.CandicateController;
import model.Candidate;

public class Main {

	public static void main(String[] args) {
		List<Candidate> candidates = new ArrayList<>();
		CandicateController candicateController = new CandicateController();
		candicateController.test();

        try (BufferedReader br = new BufferedReader(new FileReader("src/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                Candidate candidate = parseCandidate(data);
                candidates.add(candidate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
	}

	private static Candidate parseCandidate(String[] data) {
        Candidate candidate = new Candidate();

        candidate.setCandidateType(Integer.parseInt(data[0]));
        candidate.setFullName(data[1]);
        candidate.setDateOfBirth(data[2]);
        candidate.setPermanentAddress(data[3]);
        candidate.setHometown(data[4]);
        candidate.setPhoneNumber(data[5]);
        candidate.setEmailAddress(data[6]);
        candidate.setExperienceYears(data[7]);
        candidate.setProfessionalSkills(data[8]);
        candidate.setRecentWorkplace(data[9]);
        candidate.setGraduationDate(data[10]);
        candidate.setGraduationRank(data[11]);
        candidate.setGraduationSchool(data[12]);
        candidate.setCurrentMajor(data[13]);
        candidate.setCurrentSemester(data[14]);
        candidate.setCurrentSchool(data[15]);
        candidate.setExpectedGraduationDate(data[16]);

        return candidate;
    }
}
