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

public class btDispatcher {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btDispatcher(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btDispatcher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btDispatcher(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btCollisionAlgorithm findAlgorithm(btCollisionObject body0, btCollisionObject body1, btPersistentManifold sharedManifold) {
    long cPtr = gdxBulletJNI.btDispatcher_findAlgorithm__SWIG_0(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1, btPersistentManifold.getCPtr(sharedManifold), sharedManifold);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public btCollisionAlgorithm findAlgorithm(btCollisionObject body0, btCollisionObject body1) {
    long cPtr = gdxBulletJNI.btDispatcher_findAlgorithm__SWIG_1(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public btPersistentManifold getNewManifold(SWIGTYPE_p_void body0, SWIGTYPE_p_void body1) {
    long cPtr = gdxBulletJNI.btDispatcher_getNewManifold(swigCPtr, this, SWIGTYPE_p_void.getCPtr(body0), SWIGTYPE_p_void.getCPtr(body1));
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public void releaseManifold(btPersistentManifold manifold) {
    gdxBulletJNI.btDispatcher_releaseManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public void clearManifold(btPersistentManifold manifold) {
    gdxBulletJNI.btDispatcher_clearManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public boolean needsCollision(btCollisionObject body0, btCollisionObject body1) {
    return gdxBulletJNI.btDispatcher_needsCollision(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public boolean needsResponse(btCollisionObject body0, btCollisionObject body1) {
    return gdxBulletJNI.btDispatcher_needsResponse(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public void dispatchAllCollisionPairs(btOverlappingPairCache pairCache, btDispatcherInfo dispatchInfo, btDispatcher dispatcher) {
    gdxBulletJNI.btDispatcher_dispatchAllCollisionPairs(swigCPtr, this, btOverlappingPairCache.getCPtr(pairCache), pairCache, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public int getNumManifolds() {
    return gdxBulletJNI.btDispatcher_getNumManifolds(swigCPtr, this);
  }

  public btPersistentManifold getManifoldByIndexInternal(int index) {
    long cPtr = gdxBulletJNI.btDispatcher_getManifoldByIndexInternal(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public SWIGTYPE_p_p_btPersistentManifold getInternalManifoldPointer() {
    long cPtr = gdxBulletJNI.btDispatcher_getInternalManifoldPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btPersistentManifold(cPtr, false);
  }

  public btPoolAllocator getInternalManifoldPool() {
    long cPtr = gdxBulletJNI.btDispatcher_getInternalManifoldPool__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public SWIGTYPE_p_void allocateCollisionAlgorithm(int size) {
    long cPtr = gdxBulletJNI.btDispatcher_allocateCollisionAlgorithm(swigCPtr, this, size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void freeCollisionAlgorithm(SWIGTYPE_p_void ptr) {
    gdxBulletJNI.btDispatcher_freeCollisionAlgorithm(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr));
  }

}
