package io.github.mortuzahossain.quizer.catagory.model;

/**
 * Created by Mortuza Hossain on 07-Dec-2019
 * Email : mortuzahossain1997@gmail.com
 **/
public class CategoryModel {
    private String image_url, title;

    public CategoryModel(String title, String image_url) {
        this.image_url = image_url;
        this.title = title;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
