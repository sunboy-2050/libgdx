/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class HullLibrary {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HullLibrary(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HullLibrary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_HullLibrary(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_vertexIndexMapping(SWIGTYPE_p_btAlignedObjectArrayT_int_t value) {
    gdxBulletJNI.HullLibrary_m_vertexIndexMapping_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_int_t getM_vertexIndexMapping() {
    long cPtr = gdxBulletJNI.HullLibrary_m_vertexIndexMapping_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_int_t(cPtr, false);
  }

  public int CreateConvexHull(HullDesc desc, HullResult result) {
    return gdxBulletJNI.HullLibrary_CreateConvexHull(swigCPtr, this, HullDesc.getCPtr(desc), desc, HullResult.getCPtr(result), result);
  }

  public int ReleaseResult(HullResult result) {
    return gdxBulletJNI.HullLibrary_ReleaseResult(swigCPtr, this, HullResult.getCPtr(result), result);
  }

  public HullLibrary() {
    this(gdxBulletJNI.new_HullLibrary(), true);
  }

}
