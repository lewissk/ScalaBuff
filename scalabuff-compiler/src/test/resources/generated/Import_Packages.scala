// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: import_packages.proto

package resources.generated

//import "package_name.proto"

final case class UsesImportPackage (
	package_Test: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[UsesImportPackage]
	with net.sandrogrzicic.scalabuff.Parser[UsesImportPackage] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, package_Test)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, package_Test)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): UsesImportPackage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __package_Test: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance

		def __newMerged = UsesImportPackage(
			__package_Test
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __package_Test = readMessage[resources.generated.nested.PackageTest](in, __package_Test, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: UsesImportPackage) = {
		UsesImportPackage(
			m.package_Test
		)
	}

	def getDefaultInstanceForType = UsesImportPackage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object UsesImportPackage {
	@scala.beans.BeanProperty val defaultInstance = new UsesImportPackage()

	def parseFrom(data: Array[Byte]): UsesImportPackage = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): UsesImportPackage = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): UsesImportPackage = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): UsesImportPackage = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[UsesImportPackage] = defaultInstance.mergeDelimitedFromStream(stream)

	val PACKAGE_TEST_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: UsesImportPackage) = defaultInstance.mergeFrom(prototype)

}

object Import_Packages {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "UsesImportPackage" -> (bytes ⇒ UsesImportPackage.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
