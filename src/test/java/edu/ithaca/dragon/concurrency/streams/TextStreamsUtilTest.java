package edu.ithaca.dragon.concurrency.streams;

import java.util.List;

import bridges.connect.Bridges;
import bridges.connect.DataSource;
import bridges.data_src_dependent.GutenbergBook;

public class TextStreamsUtilTest {

    public void bookDataPlayground() throws Exception{
        Bridges bridges = new Bridges(1, "<YOUR_USER_ID>", "YOUR_API_KEY");
        DataSource ds = bridges.getDataSource();

        //get metadata for 20 of the top 1000 books from project gutenberg
        List<GutenbergBook> booklist = ds.getGutenbergBookMetaData().subList(0, 20);
    }
}
