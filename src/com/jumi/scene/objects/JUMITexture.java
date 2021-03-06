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
package com.jumi.scene.objects;

import java.nio.ByteBuffer;

/**
 *
 * @author RGreenlees
 */
public class JUMITexture {
    public String fileName;
    public String relativeFilename;
    public String fullFilePath;
    public String type;
    public String name;
    
    private byte[] textureData = new byte[0];
    
    public int textureDataSize() {
        return textureData.length;
    }
    
    public void setTextureData(byte[] data) {
        textureData = data;
    }
    
    /** Return the raw binary data for embedded textures (currently FBX only) */
    public byte[] getEmbeddedData() {
        if (textureData.length > 0) {
            return textureData;
        } else {
            return null;
        }
    }
    
    /** Buffer the raw binary data for embedded textures into the supplied ByteBuffer (Currently FBX only) */
    public void bufferData(ByteBuffer buf) {
        for (int i = 0; i < textureData.length; i++) {
            buf.put(textureData[i]);
        }
    }
    
    public String toString() {
        boolean embeddedData = (textureData != null && textureData.length > 0);
        return "Texture:" + "\n\tName: " + name
                          + "\n\tFile Name: " + fileName
                          + "\n\tRelative File Location: " + relativeFilename
                          + "\n\tFull Path: " + fullFilePath
                          + "\n\tEmbedded Data: " + embeddedData + " " + ((embeddedData) ? "(" + textureData.length + " bytes)" : "");
    }
    
}
