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
public enum TransformCategory implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The category of the matrix has not been
     *   determined.
     */
    UNKNOWN(0),
    
    /**
     * Analyzing the matrix concluded that it does
     *   not fit in any other category.
     */
    ANY(1),
    
    /**
     * The matrix is a 3D matrix. This means that
     *   the w column (the last column) has the values (0, 0, 0, 1).
     */
    _3D(2),
    
    /**
     * The matrix is a 2D matrix. This is equivalent
     *   to graphene_matrix_is_2d() returning {@code true}. In particular, this
     *   means that Cairo can deal with the matrix.
     */
    _2D(3),
    
    /**
     * The matrix is a combination of 2D scale
     *   and 2D translation operations. In particular, this means that any
     *   rectangle can be transformed exactly using this matrix.
     */
    _2D_AFFINE(4),
    
    /**
     * The matrix is a 2D translation.
     */
    _2D_TRANSLATE(5),
    
    /**
     * The matrix is the identity matrix.
     */
    IDENTITY(6);
    
    private static final java.lang.String C_TYPE_NAME = "GskTransformCategory";
    
    private final int value;
    
    /**
     * Create a new TransformCategory for the provided value
     * @param numeric value the enum value
     */
    TransformCategory(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TransformCategory for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TransformCategory of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> ANY;
            case 2 -> _3D;
            case 3 -> _2D;
            case 4 -> _2D_AFFINE;
            case 5 -> _2D_TRANSLATE;
            case 6 -> IDENTITY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
