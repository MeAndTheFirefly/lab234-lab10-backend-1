package camt.se234.lab10.service;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
            return "F";
    }
}
