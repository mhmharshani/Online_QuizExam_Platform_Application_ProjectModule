package edu.icet.service.impl;

import edu.icet.dto.Exam;
import edu.icet.entity.ExamEntity;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.build.BuildLogger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final ExamRepository repository;
    final ModelMapper mapper;

    @Override
    public void createExam(Exam exam) {

        repository.save(mapper.map(exam, ExamEntity.class));
        log.info(exam.toString());
    }

    @Override
    public Exam getExamByCourseId(Integer id) {
        return mapper.map(repository.getByCourseId(id), Exam.class);
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer id) {

    }
}
