package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The categories of matrices relevant for GSK and GTK.
 * <p>
 * Note that any category includes matrices of all later categories.
 * So if you want to for example check if a matrix is a 2D matrix,
 * {@code category >= GSK_TRANSFORM_CATEGORY_2D} is the way to do this.
 * <p>
 * Also keep in mind that rounding errors may cause matrices to not
 * conform to their categories. Otherwise, matrix operations done via
 * multiplication will not worsen categories. So for the matrix
 * multiplication {@code C = A * B}, {@code category(C) = MIN (category(A), category(B))}.
 */
public class TransformCategory extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GskTransformCategory";
    
    /**
     * The category of the matrix has not been
     *   determined.
     */
    public static final TransformCategory UNKNOWN = new TransformCategory(0);
    
    /**
     * Analyzing the matrix concluded that it does
     *   not fit in any other category.
     */
    public static final TransformCategory ANY = new TransformCategory(1);
    
    /**
     * The matrix is a 3D matrix. This means that
     *   the w column (the last column) has the values (0, 0, 0, 1).
     */
    public static final TransformCategory _3D = new TransformCategory(2);
    
    /**
     * The matrix is a 2D matrix. This is equivalent
     *   to graphene_matrix_is_2d() returning {@code true}. In particular, this
     *   means that Cairo can deal with the matrix.
     */
    public static final TransformCategory _2D = new TransformCategory(3);
    
    /**
     * The matrix is a combination of 2D scale
     *   and 2D translation operations. In particular, this means that any
     *   rectangle can be transformed exactly using this matrix.
     */
    public static final TransformCategory _2D_AFFINE = new TransformCategory(4);
    
    /**
     * The matrix is a 2D translation.
     */
    public static final TransformCategory _2D_TRANSLATE = new TransformCategory(5);
    
    /**
     * The matrix is the identity matrix.
     */
    public static final TransformCategory IDENTITY = new TransformCategory(6);
    
    public TransformCategory(int value) {
        super(value);
    }
}
