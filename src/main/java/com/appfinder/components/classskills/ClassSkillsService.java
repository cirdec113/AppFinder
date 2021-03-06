package com.appfinder.classSkills;

import java.util.List;

public interface ClassSkillsService {
    ClassSkills getClassSkillById(Integer classSkillId);
    void saveClassSkill(ClassSkills classSkill);
    List<ClassSkills> getAllClassSkills();
    List<ClassSkills> getByClassId(int classId);
}
