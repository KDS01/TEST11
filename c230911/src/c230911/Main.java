package c230911;

import ByteStream.OutputStreamTest;
import FileIO.FileIOTest;
import FileIO.SubTest;
import buffered.BufferedTest;
import c230911.Stream.MatchTest;
import c230911.Stream.OptionTest;
import dataStream.DataStreamTest;
import dataStream.ObjectStreamTest;

public class Main {
	public static void main(String[] args) {
		//저장, save?
		
		MatchTest.test();
		OptionTest.test();
		OutputStreamTest.test();
		FileIOTest.test();
		SubTest.test();
		BufferedTest.test();
		DataStreamTest.test();
		ObjectStreamTest.test();
		PathTest.test();
	}

}
