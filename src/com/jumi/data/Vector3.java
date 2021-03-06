/*
 * (C) Copyright 2015 Richard Greenlees
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 *  1) The above copyright notice and this permission notice shall be included
 *     in all copies or substantial portions of the Software.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.jumi.data;

/**
 * Vector3
 * 
 * A simple container for holding 3-dimensional data (such as vertices)
 * 
 * @author Richard Greenlees
 */
public class Vector3 {
    public float x;
    public float y;
    public float z;
    
    public Vector3(float newX, float newY, float newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }
    
    public void set(float newX, float newY, float newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }
    
    public Vector3() {
        super();
    }
    
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
