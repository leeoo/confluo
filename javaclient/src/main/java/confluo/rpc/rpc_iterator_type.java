/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package confluo.rpc;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum rpc_iterator_type implements org.apache.thrift.TEnum {
  RPC_ADHOC(0),
  RPC_PREDEF(1),
  RPC_COMBINED(2),
  RPC_ALERTS(3);

  private final int value;

  private rpc_iterator_type(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static rpc_iterator_type findByValue(int value) { 
    switch (value) {
      case 0:
        return RPC_ADHOC;
      case 1:
        return RPC_PREDEF;
      case 2:
        return RPC_COMBINED;
      case 3:
        return RPC_ALERTS;
      default:
        return null;
    }
  }
}