package org.gtk.gsk;

/**
 * The categories of matrices relevant for GSK and GTK.
 * <p>
 * Note that any category includes matrices of all later categories.
 * So if you want to for example check if a matrix is a 2D matrix,<code>category &#62;= GSK_TRANSFORM_CATEGORY_2D</code> is the way to do this.
 * <p>
 * Also keep in mind that rounding errors may cause matrices to not
 * conform to their categories. Otherwise, matrix operations done via
 * multiplication will not worsen categories. So for the matrix
 * multiplication <code>C = A * B</code>, <code>category(C) = MIN (category(A), category(B))</code>.
 */
public enum TransformCategory {

    /**
     * The category of the matrix has not been
     *   determined.
     */
    UNKNOWN,
    
    /**
     * Analyzing the matrix concluded that it does
     *   not fit in any other category.
     */
    ANY,
    
    /**
     * The matrix is a 3D matrix. This means that
     *   the w column (the last column) has the values (0, 0, 0, 1).
     */
    _3D,
    
    /**
     * The matrix is a 2D matrix. This is equivalent
     *   to graphene_matrix_is_2d() returning <code>TRUE.</code> In particular, this
     *   means that Cairo can deal with the matrix.
     */
    _2D,
    
    /**
     * The matrix is a combination of 2D scale
     *   and 2D translation operations. In particular, this means that any
     *   rectangle can be transformed exactly using this matrix.
     */
    _2D_AFFINE,
    
    /**
     * The matrix is a 2D translation.
     */
    _2D_TRANSLATE,
    
    /**
     * The matrix is the identity matrix.
     */
    IDENTITY;
    
    public static TransformCategory fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> ANY;
            case 2 -> _3D;
            case 3 -> _2D;
            case 4 -> _2D_AFFINE;
            case 5 -> _2D_TRANSLATE;
            case 6 -> IDENTITY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case ANY -> 1;
            case _3D -> 2;
            case _2D -> 3;
            case _2D_AFFINE -> 4;
            case _2D_TRANSLATE -> 5;
            case IDENTITY -> 6;
        };
    }

}
