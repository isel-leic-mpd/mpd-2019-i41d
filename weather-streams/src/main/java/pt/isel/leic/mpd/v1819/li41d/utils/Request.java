package pt.isel.leic.mpd.v1819.li41d.utils;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Interface that allows its users to obtain a list of strings with each line
 * of its text content.
 */
@FunctionalInterface
public interface Request {
    /**
     * Gets the lines corresponding to the text content of the givem {@code url}
     * @param url the url to get its content lines
     * @return the List of the url content lines
     */
    Stream<String> getLines(String url) throws IOException;

}
