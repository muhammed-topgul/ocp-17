package c01.understanding_package_declarations_and_imports;

// do not compile together
// import java.util.Date;
// import java.sql.Date;

// causes Date declaration to not compile
// import java.util.*;
// import java.sql.*;

// explicitly import a class name, it takes precedence over any wildcards present.
import java.util.Date;
import java.sql.*;

/**
 * @author muhammed-topgul
 * @since 08/07/2023 15:50
 */
public class Conflicts {
    Date date1;
    java.util.Date date2;
    java.sql.Date date3;
}
