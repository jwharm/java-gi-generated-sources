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
 * &#39; &#39;, &#39;!&#39;, &#39;x&#39;, &#39;z&#39;, and &#39;n&#39; to indicate bytes that must be matched,
 * not matched, &#34;don&#39;t-care&#34;-bytes, zeros and non-zeros, respectively.
 * <p>
 * Each prefix has an associated integer that describes the relevance of
 * the prefix, with 0 meaning a mismatch and 100 a &#34;perfect match&#34;.
 * <p>
 * Starting with gdk-pixbuf 2.8, the first byte of the mask may be &#39;*&#39;,
 * indicating an unanchored pattern that matches not only at the beginning,
 * but also in the middle. Versions prior to 2.8 will interpret the &#39;*&#39;
 * like an &#39;x&#39;.
 * <p>
 * The signature of a module is stored as an array of<code>GdkPixbufModulePatterns</code>. The array is terminated by a pattern
 * where the <code>prefix</code> is <code>NULL</code>.
 * <p><pre>c
 * GdkPixbufModulePattern *signature{@link []} = {
 *   { &#34;abcdx&#34;, &#34; !x z&#34;, 100 },
 *   { &#34;bla&#34;, NULL,  90 },
 *   { NULL, NULL, 0 }
 * };
 * </pre>
 * 
 * In the example above, the signature matches e.g. &#34;auud\\0&#34; with
 * relevance 100, and &#34;blau&#34; with relevance 90.
 */
public class PixbufModulePattern extends io.github.jwharm.javagi.ResourceBase {

    public PixbufModulePattern(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
