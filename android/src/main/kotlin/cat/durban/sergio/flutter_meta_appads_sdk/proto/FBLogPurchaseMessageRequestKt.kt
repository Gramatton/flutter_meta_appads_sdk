// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: log_purchase_message.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package cat.durban.sergio.flutter_meta_appads_sdk.proto;

@kotlin.jvm.JvmName("-initializefBLogPurchaseMessageRequest")
public inline fun fBLogPurchaseMessageRequest(block: cat.durban.sergio.flutter_meta_appads_sdk.proto.FBLogPurchaseMessageRequestKt.Dsl.() -> kotlin.Unit): cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest =
  cat.durban.sergio.flutter_meta_appads_sdk.proto.FBLogPurchaseMessageRequestKt.Dsl._create(cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `FBLogPurchaseMessageRequest`
 */
public object FBLogPurchaseMessageRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest = _builder.build()

    /**
     * `double amount = 1;`
     */
    public var amount: kotlin.Double
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * `double amount = 1;`
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }

    /**
     * `string currency = 2;`
     */
    public var currency: kotlin.String
      @JvmName("getCurrency")
      get() = _builder.getCurrency()
      @JvmName("setCurrency")
      set(value) {
        _builder.setCurrency(value)
      }
    /**
     * `string currency = 2;`
     */
    public fun clearCurrency() {
      _builder.clearCurrency()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EventParameterProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, string> eventParameter = 3;`
     */
     public val eventParameter: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getEventParameterMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getEventParameterMap()
      )
    /**
     * `map<string, string> eventParameter = 3;`
     */
    @JvmName("putEventParameter")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      .put(key: kotlin.String, value: kotlin.String) {
         _builder.putEventParameter(key, value)
       }
    /**
     * `map<string, string> eventParameter = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setEventParameter")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      .set(key: kotlin.String, value: kotlin.String) {
         put(key, value)
       }
    /**
     * `map<string, string> eventParameter = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeEventParameter")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      .remove(key: kotlin.String) {
         _builder.removeEventParameter(key)
       }
    /**
     * `map<string, string> eventParameter = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllEventParameter")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.String>) {
         _builder.putAllEventParameter(map)
       }
    /**
     * `map<string, string> eventParameter = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearEventParameter")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, EventParameterProxy>
      .clear() {
         _builder.clearEventParameter()
       }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest.copy(block: `cat.durban.sergio.flutter_meta_appads_sdk.proto`.FBLogPurchaseMessageRequestKt.Dsl.() -> kotlin.Unit): cat.durban.sergio.flutter_meta_appads_sdk.proto.LogPurchaseMessage.FBLogPurchaseMessageRequest =
  `cat.durban.sergio.flutter_meta_appads_sdk.proto`.FBLogPurchaseMessageRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

