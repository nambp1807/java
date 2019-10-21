package Labsesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    public  int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int[] RateList = new int[3];



    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }


    @Override
    public void Display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title"+getTitle());
        setTitle(sc.nextLine());
        System.out.println("PublishDate"+getPublishDate());
        setPublishDate(sc.nextLine());
        System.out.println("Author"+getAuthor());
        setAuthor(sc.nextLine());
        System.out.println("Content"+getContent());
        setContent(sc.nextLine());
        System.out.println("AverageRate"+getAverageRate());
        for (int i = 0; i < 3; i++) {
            RateList[i]=sc.nextInt();
        }

    }

    public double Calculate(){
        double sum = 0;
        for (int i = 0; i < 3; i++) {
           sum += RateList[i];
        }
        return sum/3;
    }

}
