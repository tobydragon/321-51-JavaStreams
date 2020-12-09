package edu.ithaca.dragon.concurrency.streams;

import java.util.stream.Stream;

import org.javatuples.Pair;

import bridges.data_src_dependent.GutenbergBook;

public interface TextStreamsUtil {

    //returns the entire plaintext of the given URL, or an empty string if the URL is not valid
    public String retrieveWebpageAsString(String urlString);

    // returns a stream of Strings, each one containing the plain text of a given gutenberg book from the input stream
    // will retrieve only books whose plain text URL is of the form: "https://www.gutenberg.org/files/<BOOK_ID>/<BOOK_ID>-0.txt"
    // Books with URLs not matching this pattern will have an empty string for text
    public Stream<String> retrieveBookTexts(Stream<GutenbergBook> gutenbergMetadata);

    //returns a stream of integers, each representing the number of occurences of the given substring in the text from the input stream
    public Stream<Integer> getSubstringCounts(Stream<String> textsToSearch, String strToFind);

    //returns total and average(EXCLUDING ALL ZERO VALUES) of numbers in the stream
    //If there are no values in the stream, the total and average should be 0
    public Pair<Integer, Double> calcTotalAndAverage(Stream<Integer> numberStream); 

}
