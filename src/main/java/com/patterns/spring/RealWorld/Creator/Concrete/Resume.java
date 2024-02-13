package com.patterns.spring.RealWorld.Creator.Concrete;

import com.patterns.spring.RealWorld.Creator.Document;
import com.patterns.spring.RealWorld.Product.Concrete.EducationPage;
import com.patterns.spring.RealWorld.Product.Concrete.ExperiencePage;
import com.patterns.spring.RealWorld.Product.Page;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Document {

    @Override
    public void CreatePages() {
        List<Page> pageList = new ArrayList<>();
        pageList.add(new ExperiencePage());
        pageList.add(new EducationPage());
        set_pages(pageList);
    }
}
