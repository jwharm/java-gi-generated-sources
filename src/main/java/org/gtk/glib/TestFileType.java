package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of file to return the filename for, when used with
 * g_test_build_filename().
 * <p>
 * These two options correspond rather directly to the 'dist' and
 * 'built' terminology that automake uses and are explicitly used to
 * distinguish between the 'srcdir' and 'builddir' being separate.  All
 * files in your project should either be dist (in the
 * {@code EXTRA_DIST} or {@code dist_schema_DATA}
 * sense, in which case they will always be in the srcdir) or built (in
 * the {@code BUILT_SOURCES} sense, in which case they will
 * always be in the builddir).
 * <p>
 * Note: as a general rule of automake, files that are generated only as
 * part of the build-from-git process (but then are distributed with the
 * tarball) always go in srcdir (even if doing a srcdir != builddir
 * build from git) and are considered as distributed files.
 * @version 2.38
 */
public class TestFileType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * a file that was included in the distribution tarball
     */
    public static final TestFileType DIST = new TestFileType(0);
    
    /**
     * a file that was built on the compiling machine
     */
    public static final TestFileType BUILT = new TestFileType(1);
    
    public TestFileType(int value) {
        super(value);
    }
}
