/*
 Generated by org.infinispan.protostream.annotations.impl.processor.MarshallerSourceCodeGenerator
 for class com.redhat.apps.client.rhdgspringboot.entity.PersonEntity
*/

package com.redhat.apps.client.rhdgspringboot.entity;

/**
 * WARNING: Generated code! Do not edit!
 *
 * @private
 */
@javax.annotation.Generated(
   value = "org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor",
   comments = "Please do not edit this file!"
)
@org.infinispan.protostream.annotations.impl.OriginatingClasses({
   "com.redhat.apps.client.rhdgspringboot.entity.PersonEntity"
})
@SuppressWarnings("unchecked")
public final class PersonEntity$___Marshaller_4085378c4b5a422334db28b3c61ebcad5f0b1f1d44c705d6eb16f36a087120d5 extends org.infinispan.protostream.annotations.impl.GeneratedMarshallerBase implements org.infinispan.protostream.RawProtobufMarshaller<com.redhat.apps.client.rhdgspringboot.entity.PersonEntity> {

   @Override
   public Class<com.redhat.apps.client.rhdgspringboot.entity.PersonEntity> getJavaClass() { return com.redhat.apps.client.rhdgspringboot.entity.PersonEntity.class; }
   
   @Override
   public String getTypeName() { return "demo.PersonEntity"; }
   
   @Override
   public com.redhat.apps.client.rhdgspringboot.entity.PersonEntity readFrom(org.infinispan.protostream.ImmutableSerializationContext $1, org.infinispan.protostream.RawProtoStreamReader $2) throws java.io.IOException {
      final com.redhat.apps.client.rhdgspringboot.entity.PersonEntity o = new com.redhat.apps.client.rhdgspringboot.entity.PersonEntity();
      boolean done = false;
      while (!done) {
         final int tag = $2.readTag();
         switch (tag) {
            case 0:
               done = true;
               break;
            case 10: {
               java.lang.String __v$1 = $2.readString();
               o.id = __v$1;
               break;
            }
            case 18: {
               java.lang.String __v$2 = $2.readString();
               o.name = __v$2;
               break;
            }
            case 26: {
               java.lang.String __v$3 = $2.readString();
               o.email = __v$3;
               break;
            }
            default: {
               if (!$2.skipField(tag)) done = true;
            }
         }
      }
      return o;
   }
   
   @Override
   public void writeTo(org.infinispan.protostream.ImmutableSerializationContext $1, org.infinispan.protostream.RawProtoStreamWriter $2, com.redhat.apps.client.rhdgspringboot.entity.PersonEntity $3) throws java.io.IOException {
      final com.redhat.apps.client.rhdgspringboot.entity.PersonEntity o = (com.redhat.apps.client.rhdgspringboot.entity.PersonEntity) $3;
      {
         final java.lang.String __v$1 = o.id;
         if (__v$1 != null) $2.writeString(1, __v$1);
      }
      {
         final java.lang.String __v$2 = o.name;
         if (__v$2 != null) $2.writeString(2, __v$2);
      }
      {
         final java.lang.String __v$3 = o.email;
         if (__v$3 != null) $2.writeString(3, __v$3);
      }
   }
}
