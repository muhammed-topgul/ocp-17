package c01.understanding_package_declarations_and_imports;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.nio.*; // NO GOOD -  a wildcard only matches class names, not "file.Files"
// DOES NOT COMPILE;
// import java.nio.*.*; // NO GOOD - you can only have one wildcard and it must be at the end

import java.nio.file.Paths.*; // NO GOOD - you cannot imports methods only class names

/**
 * @author muhammed-topgul
 * @since 07/07/2023 12:09
 */
public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}
