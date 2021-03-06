// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: complex.proto

package resources.generated

final case class ComplexMessage (
	first_Field: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
	second_Field: Option[String] = Some("defaultValueForSecondField"),
	nested_Outer_Field: Option[ComplexMessage.Nested] = None,
	simple_Enum_Field: scala.collection.immutable.Seq[ComplexMessage.SimpleEnum.EnumVal] = Vector.empty[ComplexMessage.SimpleEnum.EnumVal],
	repeated_String_Field: scala.collection.immutable.Seq[String] = Vector.empty[String],
	repeated_Bytes_Field: scala.collection.immutable.Seq[com.google.protobuf.ByteString] = Vector.empty[com.google.protobuf.ByteString]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[ComplexMessage]
	with net.sandrogrzicic.scalabuff.Parser[ComplexMessage] {

	def setSecond_Field(_f: String) = copy(second_Field = Some(_f))
	def setNested_Outer_Field(_f: ComplexMessage.Nested) = copy(nested_Outer_Field = Some(_f))
	def setSimple_Enum_Field(_i: Int, _v: ComplexMessage.SimpleEnum.EnumVal) = copy(simple_Enum_Field = simple_Enum_Field.updated(_i, _v))
	def addSimple_Enum_Field(_f: ComplexMessage.SimpleEnum.EnumVal) = copy(simple_Enum_Field = simple_Enum_Field :+ _f)
	def addAllSimple_Enum_Field(_f: ComplexMessage.SimpleEnum.EnumVal*) = copy(simple_Enum_Field = simple_Enum_Field ++ _f)
	def addAllSimple_Enum_Field(_f: TraversableOnce[ComplexMessage.SimpleEnum.EnumVal]) = copy(simple_Enum_Field = simple_Enum_Field ++ _f)
	def setRepeated_String_Field(_i: Int, _v: String) = copy(repeated_String_Field = repeated_String_Field.updated(_i, _v))
	def addRepeated_String_Field(_f: String) = copy(repeated_String_Field = repeated_String_Field :+ _f)
	def addAllRepeated_String_Field(_f: String*) = copy(repeated_String_Field = repeated_String_Field ++ _f)
	def addAllRepeated_String_Field(_f: TraversableOnce[String]) = copy(repeated_String_Field = repeated_String_Field ++ _f)
	def setRepeated_Bytes_Field(_i: Int, _v: com.google.protobuf.ByteString) = copy(repeated_Bytes_Field = repeated_Bytes_Field.updated(_i, _v))
	def addRepeated_Bytes_Field(_f: com.google.protobuf.ByteString) = copy(repeated_Bytes_Field = repeated_Bytes_Field :+ _f)
	def addAllRepeated_Bytes_Field(_f: com.google.protobuf.ByteString*) = copy(repeated_Bytes_Field = repeated_Bytes_Field ++ _f)
	def addAllRepeated_Bytes_Field(_f: TraversableOnce[com.google.protobuf.ByteString]) = copy(repeated_Bytes_Field = repeated_Bytes_Field ++ _f)

	def clearSecond_Field = copy(second_Field = None)
	def clearNested_Outer_Field = copy(nested_Outer_Field = None)
	def clearSimple_Enum_Field = copy(simple_Enum_Field = Vector.empty[ComplexMessage.SimpleEnum.EnumVal])
	def clearRepeated_String_Field = copy(repeated_String_Field = Vector.empty[String])
	def clearRepeated_Bytes_Field = copy(repeated_Bytes_Field = Vector.empty[com.google.protobuf.ByteString])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeBytes(1, first_Field)
		if (second_Field.isDefined) output.writeString(2, second_Field.get)
		if (nested_Outer_Field.isDefined) output.writeMessage(3, nested_Outer_Field.get)
		var index_simple_Enum_Field = 0
		while (index_simple_Enum_Field < simple_Enum_Field.length) {
			output.writeEnum(4, simple_Enum_Field(index_simple_Enum_Field))
			index_simple_Enum_Field += 1
		}
		var index_repeated_String_Field = 0
		while (index_repeated_String_Field < repeated_String_Field.length) {
			output.writeString(5, repeated_String_Field(index_repeated_String_Field))
			index_repeated_String_Field += 1
		}
		var index_repeated_Bytes_Field = 0
		while (index_repeated_Bytes_Field < repeated_Bytes_Field.length) {
			output.writeBytes(6, repeated_Bytes_Field(index_repeated_Bytes_Field))
			index_repeated_Bytes_Field += 1
		}
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeBytesSize(1, first_Field)
		if (second_Field.isDefined) __size += computeStringSize(2, second_Field.get)
		if (nested_Outer_Field.isDefined) __size += computeMessageSize(3, nested_Outer_Field.get)
		var index_simple_Enum_Field = 0
		while (index_simple_Enum_Field < simple_Enum_Field.length) {
			__size += computeEnumSize(4, simple_Enum_Field(index_simple_Enum_Field))
			index_simple_Enum_Field += 1
		}
		var index_repeated_String_Field = 0
		while (index_repeated_String_Field < repeated_String_Field.length) {
			__size += computeStringSize(5, repeated_String_Field(index_repeated_String_Field))
			index_repeated_String_Field += 1
		}
		var index_repeated_Bytes_Field = 0
		while (index_repeated_Bytes_Field < repeated_Bytes_Field.length) {
			__size += computeBytesSize(6, repeated_Bytes_Field(index_repeated_Bytes_Field))
			index_repeated_Bytes_Field += 1
		}

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): ComplexMessage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __first_Field: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
		var __second_Field: Option[String] = second_Field
		var __nested_Outer_Field: Option[ComplexMessage.Nested] = nested_Outer_Field
		val __simple_Enum_Field: scala.collection.mutable.Buffer[ComplexMessage.SimpleEnum.EnumVal] = simple_Enum_Field.toBuffer
		val __repeated_String_Field: scala.collection.mutable.Buffer[String] = repeated_String_Field.toBuffer
		val __repeated_Bytes_Field: scala.collection.mutable.Buffer[com.google.protobuf.ByteString] = repeated_Bytes_Field.toBuffer

		def __newMerged = ComplexMessage(
			__first_Field,
			__second_Field,
			__nested_Outer_Field,
			Vector(__simple_Enum_Field: _*),
			Vector(__repeated_String_Field: _*),
			Vector(__repeated_Bytes_Field: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __first_Field = in.readBytes()
			case 18 => __second_Field = Some(in.readString())
			case 26 => __nested_Outer_Field = Some(readMessage[ComplexMessage.Nested](in, __nested_Outer_Field.orElse({
				__nested_Outer_Field = ComplexMessage.Nested.defaultInstance
				__nested_Outer_Field
			}).get, _emptyRegistry))
			case 32 => __simple_Enum_Field += ComplexMessage.SimpleEnum.valueOf(in.readEnum())
			case 34 => 
				val length = in.readRawVarint32()
				val limit = in.pushLimit(length)
				while (in.getBytesUntilLimit() > 0) {
					__simple_Enum_Field += ComplexMessage.SimpleEnum.valueOf(in.readEnum())
				}
				in.popLimit(limit)
			case 42 => __repeated_String_Field += in.readString()
			case 50 => __repeated_Bytes_Field += in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: ComplexMessage) = {
		ComplexMessage(
			m.first_Field,
			m.second_Field.orElse(second_Field),
			m.nested_Outer_Field.orElse(nested_Outer_Field),
			simple_Enum_Field ++ m.simple_Enum_Field,
			repeated_String_Field ++ m.repeated_String_Field,
			repeated_Bytes_Field ++ m.repeated_Bytes_Field
		)
	}

	def getDefaultInstanceForType = ComplexMessage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"first_Field\": ").append("\"").append(`first_Field`).append("\"").append(',')
			if (`second_Field`.isDefined) { sb.append(indent1).append("\"second_Field\": ").append("\"").append(`second_Field`.get).append("\"").append(',') }
			if (`nested_Outer_Field`.isDefined) { sb.append(indent1).append("\"nested_Outer_Field\": ").append(`nested_Outer_Field`.get.toJson(indent + 1)).append(',') }
			sb.append(indent1).append("\"simple_Enum_Field\": [").append(indent2).append(`simple_Enum_Field`.map("\"" + _ + "\"").mkString(", " + indent2)).append(indent1).append(']').append(',')
			sb.append(indent1).append("\"repeated_String_Field\": [").append(indent2).append(`repeated_String_Field`.map("\"" + _ + "\"").mkString(", " + indent2)).append(indent1).append(']').append(',')
			sb.append(indent1).append("\"repeated_Bytes_Field\": [").append(indent2).append(`repeated_Bytes_Field`.map("\"" + _ + "\"").mkString(", " + indent2)).append(indent1).append(']').append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object ComplexMessage {
	@scala.beans.BeanProperty val defaultInstance = new ComplexMessage()

	def parseFrom(data: Array[Byte]): ComplexMessage = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): ComplexMessage = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): ComplexMessage = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): ComplexMessage = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[ComplexMessage] = defaultInstance.mergeDelimitedFromStream(stream)

	val FIRST_FIELD_FIELD_NUMBER = 1
	val SECOND_FIELD_FIELD_NUMBER = 2
	val NESTED_OUTER_FIELD_FIELD_NUMBER = 3
	val SIMPLE_ENUM_FIELD_FIELD_NUMBER = 4
	val REPEATED_STRING_FIELD_FIELD_NUMBER = 5
	val REPEATED_BYTES_FIELD_FIELD_NUMBER = 6

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: ComplexMessage) = defaultInstance.mergeFrom(prototype)

	object SimpleEnum extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val KEY_NAME = new EnumVal { val name = "KEY_NAME"; val id = 1 }

		val KEY_NAME_VALUE = 1

		def valueOf(id: Int) = id match {
			case 1 => KEY_NAME
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

	final case class Nested (
		nested_Field: String = "",
		nested_Enum: Option[SimpleEnum.EnumVal] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Nested]
		with net.sandrogrzicic.scalabuff.Parser[Nested] {

		def setNested_Enum(_f: SimpleEnum.EnumVal) = copy(nested_Enum = Some(_f))

		def clearNested_Enum = copy(nested_Enum = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeString(1, nested_Field)
			if (nested_Enum.isDefined) output.writeEnum(2, nested_Enum.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			__size += computeStringSize(1, nested_Field)
			if (nested_Enum.isDefined) __size += computeEnumSize(2, nested_Enum.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Nested = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __nested_Field: String = ""
			var __nested_Enum: Option[SimpleEnum.EnumVal] = nested_Enum

			def __newMerged = Nested(
				__nested_Field,
				__nested_Enum
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __nested_Field = in.readString()
				case 16 => __nested_Enum = Some(SimpleEnum.valueOf(in.readEnum()))
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Nested) = {
			Nested(
				m.nested_Field,
				m.nested_Enum.orElse(nested_Enum)
			)
		}

		def getDefaultInstanceForType = Nested.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				sb.append(indent1).append("\"nested_Field\": ").append("\"").append(`nested_Field`).append("\"").append(',')
				if (`nested_Enum`.isDefined) { sb.append(indent1).append("\"nested_Enum\": ").append("\"").append(`nested_Enum`.get).append("\"").append(',') }
			if (sb.last.equals(',')) sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Nested {
		@scala.beans.BeanProperty val defaultInstance = new Nested()

		def parseFrom(data: Array[Byte]): Nested = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Nested = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Nested = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Nested = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Nested] = defaultInstance.mergeDelimitedFromStream(stream)

		val NESTED_FIELD_FIELD_NUMBER = 1
		val NESTED_ENUM_FIELD_NUMBER = 2

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Nested) = defaultInstance.mergeFrom(prototype)

	}
}
final case class AnotherMessage (
	field_Nested: ComplexMessage.Nested = ComplexMessage.Nested.defaultInstance,
	field_Enum: ComplexMessage.SimpleEnum.EnumVal = ComplexMessage.SimpleEnum._UNINITIALIZED
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AnotherMessage]
	with net.sandrogrzicic.scalabuff.Parser[AnotherMessage] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, field_Nested)
		output.writeEnum(2, field_Enum)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, field_Nested)
		__size += computeEnumSize(2, field_Enum)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AnotherMessage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __field_Nested: ComplexMessage.Nested = ComplexMessage.Nested.defaultInstance
		var __field_Enum: ComplexMessage.SimpleEnum.EnumVal = ComplexMessage.SimpleEnum._UNINITIALIZED

		def __newMerged = AnotherMessage(
			__field_Nested,
			__field_Enum
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __field_Nested = readMessage[ComplexMessage.Nested](in, __field_Nested, _emptyRegistry)
			case 16 => __field_Enum = ComplexMessage.SimpleEnum.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AnotherMessage) = {
		AnotherMessage(
			m.field_Nested,
			m.field_Enum
		)
	}

	def getDefaultInstanceForType = AnotherMessage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"field_Nested\": ").append(`field_Nested`.toJson(indent + 1)).append(',')
			sb.append(indent1).append("\"field_Enum\": ").append("\"").append(`field_Enum`).append("\"").append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object AnotherMessage {
	@scala.beans.BeanProperty val defaultInstance = new AnotherMessage()

	def parseFrom(data: Array[Byte]): AnotherMessage = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): AnotherMessage = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): AnotherMessage = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): AnotherMessage = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[AnotherMessage] = defaultInstance.mergeDelimitedFromStream(stream)

	val FIELD_NESTED_FIELD_NUMBER = 1
	val FIELD_ENUM_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AnotherMessage) = defaultInstance.mergeFrom(prototype)

}

object Complex {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "ComplexMessage" -> (bytes ⇒ ComplexMessage.parseFrom(bytes)),
		 "AnotherMessage" -> (bytes ⇒ AnotherMessage.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
