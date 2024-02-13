package com.patterns.spring.RealWorld.Creator.Concrete;

import com.patterns.spring.RealWorld.Creator.Document;
import com.patterns.spring.RealWorld.Product.Concrete.EducationPage;
import com.patterns.spring.RealWorld.Product.Concrete.ExperiencePage;
import com.patterns.spring.RealWorld.Product.Concrete.SkillsPage;
import com.patterns.spring.RealWorld.Product.Page;

import java.util.ArrayList;
import java.util.List;

public class Report extends Document {

    @Override
    public void CreatePages() {
        List<Page> pageList = new ArrayList<>();
        pageList.add(new ExperiencePage());
        pageList.add(new ExperiencePage());
        pageList.add(new SkillsPage());
        pageList.add(new EducationPage());
        pageList.add(new EducationPage());
        pageList.add(new EducationPage());
        pageList.add(new EducationPage());
        set_pages(pageList);
    }
}
