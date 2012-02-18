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

public class btTypedConstraint extends btTypedObject {
  private long swigCPtr;

  public btTypedConstraint(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btTypedConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTypedConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTypedConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public static btRigidBody getFixedBody() {
    return new btRigidBody(gdxBulletJNI.btTypedConstraint_getFixedBody(), false);
  }

  public void buildJacobian() {
    gdxBulletJNI.btTypedConstraint_buildJacobian(swigCPtr, this);
  }

  public void setupSolverConstraint(SWIGTYPE_p_btAlignedObjectArrayT_btSolverConstraint_t ca, int solverBodyA, int solverBodyB, float timeStep) {
    gdxBulletJNI.btTypedConstraint_setupSolverConstraint(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSolverConstraint_t.getCPtr(ca), solverBodyA, solverBodyB, timeStep);
  }

  public void getInfo1(SWIGTYPE_p_btTypedConstraint__btConstraintInfo1 info) {
    gdxBulletJNI.btTypedConstraint_getInfo1(swigCPtr, this, SWIGTYPE_p_btTypedConstraint__btConstraintInfo1.getCPtr(info));
  }

  public void getInfo2(btConstraintInfo2 info) {
    gdxBulletJNI.btTypedConstraint_getInfo2(swigCPtr, this, btConstraintInfo2.getCPtr(info), info);
  }

  public void internalSetAppliedImpulse(float appliedImpulse) {
    gdxBulletJNI.btTypedConstraint_internalSetAppliedImpulse(swigCPtr, this, appliedImpulse);
  }

  public float internalGetAppliedImpulse() {
    return gdxBulletJNI.btTypedConstraint_internalGetAppliedImpulse(swigCPtr, this);
  }

  public float getBreakingImpulseThreshold() {
    return gdxBulletJNI.btTypedConstraint_getBreakingImpulseThreshold(swigCPtr, this);
  }

  public void setBreakingImpulseThreshold(float threshold) {
    gdxBulletJNI.btTypedConstraint_setBreakingImpulseThreshold(swigCPtr, this, threshold);
  }

  public boolean isEnabled() {
    return gdxBulletJNI.btTypedConstraint_isEnabled(swigCPtr, this);
  }

  public void setEnabled(boolean enabled) {
    gdxBulletJNI.btTypedConstraint_setEnabled(swigCPtr, this, enabled);
  }

  public void solveConstraintObsolete(btRigidBody arg0, btRigidBody arg1, float arg2) {
    gdxBulletJNI.btTypedConstraint_solveConstraintObsolete(swigCPtr, this, btRigidBody.getCPtr(arg0), arg0, btRigidBody.getCPtr(arg1), arg1, arg2);
  }

  public btRigidBody getRigidBodyA() {
    return new btRigidBody(gdxBulletJNI.btTypedConstraint_getRigidBodyA__SWIG_0(swigCPtr, this), false);
  }

  public btRigidBody getRigidBodyB() {
    return new btRigidBody(gdxBulletJNI.btTypedConstraint_getRigidBodyB__SWIG_0(swigCPtr, this), false);
  }

  public int getUserConstraintType() {
    return gdxBulletJNI.btTypedConstraint_getUserConstraintType(swigCPtr, this);
  }

  public void setUserConstraintType(int userConstraintType) {
    gdxBulletJNI.btTypedConstraint_setUserConstraintType(swigCPtr, this, userConstraintType);
  }

  public void setUserConstraintId(int uid) {
    gdxBulletJNI.btTypedConstraint_setUserConstraintId(swigCPtr, this, uid);
  }

  public int getUserConstraintId() {
    return gdxBulletJNI.btTypedConstraint_getUserConstraintId(swigCPtr, this);
  }

  public void setUserConstraintPtr(SWIGTYPE_p_void ptr) {
    gdxBulletJNI.btTypedConstraint_setUserConstraintPtr(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr));
  }

  public SWIGTYPE_p_void getUserConstraintPtr() {
    long cPtr = gdxBulletJNI.btTypedConstraint_getUserConstraintPtr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public int getUid() {
    return gdxBulletJNI.btTypedConstraint_getUid(swigCPtr, this);
  }

  public boolean needsFeedback() {
    return gdxBulletJNI.btTypedConstraint_needsFeedback(swigCPtr, this);
  }

  public void enableFeedback(boolean needsFeedback) {
    gdxBulletJNI.btTypedConstraint_enableFeedback(swigCPtr, this, needsFeedback);
  }

  public float getAppliedImpulse() {
    return gdxBulletJNI.btTypedConstraint_getAppliedImpulse(swigCPtr, this);
  }

  public int getConstraintType() {
    return gdxBulletJNI.btTypedConstraint_getConstraintType(swigCPtr, this);
  }

  public void setDbgDrawSize(float dbgDrawSize) {
    gdxBulletJNI.btTypedConstraint_setDbgDrawSize(swigCPtr, this, dbgDrawSize);
  }

  public float getDbgDrawSize() {
    return gdxBulletJNI.btTypedConstraint_getDbgDrawSize(swigCPtr, this);
  }

  public void setParam(int num, float value, int axis) {
    gdxBulletJNI.btTypedConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    gdxBulletJNI.btTypedConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public float getParam(int num, int axis) {
    return gdxBulletJNI.btTypedConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return gdxBulletJNI.btTypedConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public int calculateSerializeBufferSize() {
    return gdxBulletJNI.btTypedConstraint_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btTypedConstraint_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

}
