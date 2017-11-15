package out

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Outt {

    private static def output_file

    static {
        def date_format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm")
        def file_name = LocalDateTime.now().format(date_format)

        output_file = new File(file_name + ".txt")
    }

    synchronized static void out(msg)
    {
        output_file << msg
    }
}
