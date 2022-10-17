package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for blobs. A blob wraps a chunk of binary
 * data and facilitates its lifecycle management between
 * a client program and HarfBuzz.
 */
public class BlobT extends io.github.jwharm.javagi.ResourceBase {

    public BlobT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
