package exam15

import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption


/**
 * kotlin에서는 예외처리 안해도 된다. 자바에서는 try-catch로 예외처리를 해야 한다.
 */

fun main() {
    Files.copy(File("a.txt").toPath(), File("a_copy.txt").toPath(), StandardCopyOption.REPLACE_EXISTING);
}