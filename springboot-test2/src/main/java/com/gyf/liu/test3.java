package com.gyf.liu;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class test3 {
        public static void main(String[] args) throws IOException {
            try(
                    Stream<String> in = Files.lines(
                            Paths.get("StreamsAreAutoCloseable.java"));
                    PrintWriter outfile = new PrintWriter("Results.txt");
            ) {
                in.skip(5)
                        .limit(1)
                        .map(String::toLowerCase)
                        .forEachOrdered(outfile::println);
            }
        }

}
