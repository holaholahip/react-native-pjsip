/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_tp_proto {
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_NONE = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_NONE", pjsua2JNI.PJMEDIA_TP_PROTO_NONE_get());
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_AVP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_AVP");
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_RTP_SAVP = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_RTP_SAVP");
  public final static pjmedia_tp_proto PJMEDIA_TP_PROTO_UNKNOWN = new pjmedia_tp_proto("PJMEDIA_TP_PROTO_UNKNOWN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_tp_proto swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_tp_proto.class + " with value " + swigValue);
  }

  private pjmedia_tp_proto(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_tp_proto(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_tp_proto(String swigName, pjmedia_tp_proto swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_tp_proto[] swigValues = { PJMEDIA_TP_PROTO_NONE, PJMEDIA_TP_PROTO_RTP_AVP, PJMEDIA_TP_PROTO_RTP_SAVP, PJMEDIA_TP_PROTO_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

