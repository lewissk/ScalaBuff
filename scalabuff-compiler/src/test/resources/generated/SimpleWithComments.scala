// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: simpleWithComments.proto

package resources.generated

final case class SimpleRequest (
	query: String = "",
	page_Number: Option[Int] = None,
	results_Per_Page: Option[Int] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[SimpleRequest]
	with net.sandrogrzicic.scalabuff.Parser[SimpleRequest] {

	def setPage_Number(_f: Int) = copy(page_Number = Some(_f))
	def setResults_Per_Page(_f: Int) = copy(results_Per_Page = Some(_f))

	def clearPage_Number = copy(page_Number = None)
	def clearResults_Per_Page = copy(results_Per_Page = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, query)
		if (page_Number.isDefined) output.writeInt32(2, page_Number.get)
		if (results_Per_Page.isDefined) output.writeInt32(3, results_Per_Page.get)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, query)
		if (page_Number.isDefined) __size += computeInt32Size(2, page_Number.get)
		if (results_Per_Page.isDefined) __size += computeInt32Size(3, results_Per_Page.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): SimpleRequest = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __query: String = ""
		var __page_Number: Option[Int] = page_Number
		var __results_Per_Page: Option[Int] = results_Per_Page

		def __newMerged = SimpleRequest(
			__query,
			__page_Number,
			__results_Per_Page
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __query = in.readString()
			case 16 => __page_Number = Some(in.readInt32())
			case 24 => __results_Per_Page = Some(in.readInt32())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: SimpleRequest) = {
		SimpleRequest(
			m.query,
			m.page_Number.orElse(page_Number),
			m.results_Per_Page.orElse(results_Per_Page)
		)
	}

	def getDefaultInstanceForType = SimpleRequest.defaultInstance
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
			sb.append(indent1).append("\"query\": ").append("\"").append(`query`).append("\"").append(',')
			if (`page_Number`.isDefined) { sb.append(indent1).append("\"page_Number\": ").append("\"").append(`page_Number`.get).append("\"").append(',') }
			if (`results_Per_Page`.isDefined) { sb.append(indent1).append("\"results_Per_Page\": ").append("\"").append(`results_Per_Page`.get).append("\"").append(',') }
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object SimpleRequest {
	@scala.beans.BeanProperty val defaultInstance = new SimpleRequest()

	def parseFrom(data: Array[Byte]): SimpleRequest = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): SimpleRequest = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): SimpleRequest = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): SimpleRequest = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[SimpleRequest] = defaultInstance.mergeDelimitedFromStream(stream)

	val QUERY_FIELD_NUMBER = 1
	val PAGE_NUMBER_FIELD_NUMBER = 2
	val RESULTS_PER_PAGE_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: SimpleRequest) = defaultInstance.mergeFrom(prototype)

}

object SimpleWithComments {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "SimpleRequest" -> (bytes ⇒ SimpleRequest.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
