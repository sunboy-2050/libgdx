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

public class btPolyhedralConvexShape extends btConvexInternalShape {
  private long swigCPtr;

  public btPolyhedralConvexShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btPolyhedralConvexShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btPolyhedralConvexShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btPolyhedralConvexShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public boolean initializePolyhedralFeatures() {
    return gdxBulletJNI.btPolyhedralConvexShape_initializePolyhedralFeatures(swigCPtr, this);
  }

  public btConvexPolyhedron getConvexPolyhedron() {
    long cPtr = gdxBulletJNI.btPolyhedralConvexShape_getConvexPolyhedron(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexPolyhedron(cPtr, false);
  }

  public int getNumVertices() {
    return gdxBulletJNI.btPolyhedralConvexShape_getNumVertices(swigCPtr, this);
  }

  public int getNumEdges() {
    return gdxBulletJNI.btPolyhedralConvexShape_getNumEdges(swigCPtr, this);
  }

  public void getEdge(int i, Vector3 pa, Vector3 pb) {
    gdxBulletJNI.btPolyhedralConvexShape_getEdge(swigCPtr, this, i, pa, pb);
  }

  public void getVertex(int i, Vector3 vtx) {
    gdxBulletJNI.btPolyhedralConvexShape_getVertex(swigCPtr, this, i, vtx);
  }

  public int getNumPlanes() {
    return gdxBulletJNI.btPolyhedralConvexShape_getNumPlanes(swigCPtr, this);
  }

  public void getPlane(Vector3 planeNormal, Vector3 planeSupport, int i) {
    gdxBulletJNI.btPolyhedralConvexShape_getPlane(swigCPtr, this, planeNormal, planeSupport, i);
  }

  public boolean isInside(Vector3 pt, float tolerance) {
    return gdxBulletJNI.btPolyhedralConvexShape_isInside(swigCPtr, this, pt, tolerance);
  }

}
