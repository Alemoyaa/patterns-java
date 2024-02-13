package com.patterns.spring.RealWorld.Creator;

import com.patterns.spring.RealWorld.Product.Page;

import java.util.*;

public abstract class Document {
    private List<Page> _pages = new ArrayList<Page>();

    public Document() {
        this.CreatePages();
    }

    public List<Page> get_pages() {
        return _pages;
    }

    public void set_pages(List<Page> _pages) {
        this._pages = _pages;
    }

    public abstract void CreatePages();
}
