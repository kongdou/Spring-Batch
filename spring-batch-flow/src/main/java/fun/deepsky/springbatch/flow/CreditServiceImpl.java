package fun.deepsky.springbatch.flow;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CreditServiceImpl implements CreditService{

	ResourceLoader loader = new DefaultResourceLoader();
	
	@Override
	public void decompress(String inputFile, String outputDirectory) {
		// TODO Auto-generated method stub

		Resource inputFileResource = loader.getResource(inputFile);
		Resource outputDirectoryResource = loader.getResource(outputDirectory);
		try {
			ZipUtils.decompressZip(inputFileResource.getFile().getAbsolutePath(), 
					outputDirectoryResource.getFile().getAbsolutePath());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String verify(String outputDirectory, String readFileName) {

		try {
			Resource outputDirectoryResource = loader.getResource(outputDirectory + readFileName);
			if(!outputDirectoryResource.exists()){
				return "FAILED";
			}
			if(!outputDirectoryResource.getFile().canRead()){
				return "SKIPTOCLEAN";
			}else {
				return "COMPLETED";
			}
		} catch (IOException e) {
			return "FAILED";
		}
	}

	@Override
	public void clean(String outputDirectory) {
		// TODO Auto-generated method stub
		Resource outputDirectoryResource = loader.getResource(outputDirectory);
		try {
			FileUtils.cleanDirectory(outputDirectoryResource.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean exists(String file) {
		Resource fileResource = loader.getResource(file);
		return fileResource.exists();
	}

}
