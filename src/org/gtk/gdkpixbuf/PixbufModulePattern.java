package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The signature prefix for a module.
 * <p>
 * The signature of a module is a set of prefixes. Prefixes are encoded as
 * pairs of ordinary strings, where the second string, called the mask, if
 * not <code>NULL</code>, must be of the same length as the first one and may contain
 * &<code>#39</code>  &<code>#39</code> , &<code>#39</code> !&<code>#39</code> , &<code>#39</code> x&<code>#39</code> , &<code>#39</code> z&<code>#39</code> , and &<code>#39</code> n&<code>#39</code>  to indicate bytes that must be matched,
 * not matched, &<code>#34</code> don&<code>#39</code> t-care&<code>#34</code> -bytes, zeros and non-zeros, respectively.
 * <p>
 * Each prefix has an associated integer that describes the relevance of
 * the prefix, with 0 meaning a mismatch and 100 a &<code>#34</code> perfect match&<code>#34</code> .
 * <p>
 * Starting with gdk-pixbuf 2.8, the first byte of the mask may be &<code>#39</code> *&<code>#39</code> ,
 * indicating an unanchored pattern that matches not only at the beginning,
 * but also in the middle. Versions prior to 2.8 will interpret the &<code>#39</code> *&<code>#39</code> 
 * like an &<code>#39</code> x&<code>#39</code> .
 * <p>
 * The signature of a module is stored as an array of<code>GdkPixbufModulePatterns</code>. The array is terminated by a pattern
 * where the <code>prefix</code> is <code>NULL</code>.
 * <p><pre>c
 * GdkPixbufModulePattern *signature{@link []} = {
 *   { &<code>#34</code> abcdx&<code>#34</code> , &<code>#34</code>  !x z&<code>#34</code> , 100 },
 *   { &<code>#34</code> bla&<code>#34</code> , NULL,  90 },
 *   { NULL, NULL, 0 }
 * };
 * </pre>
 * 
 * In the example above, the signature matches e.g. &<code>#34</code> auud\\0&<code>#34</code>  with
 * relevance 100, and &<code>#34</code> blau&<code>#34</code>  with relevance 90.
 */
public class PixbufModulePattern extends io.github.jwharm.javagi.ResourceBase {

    public PixbufModulePattern(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
