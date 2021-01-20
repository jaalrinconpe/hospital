package co.hospital.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Component;

@Component
@ReadingConverter
public class BytesToDateConverter implements Converter<byte[], Date> {

	@Override
	public Date convert(byte[] source) {
		String d = Arrays.toString(source);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a");
		try {
			return dateFormat.parse(d);
		} catch (ParseException e) {
			throw new RuntimeException("Error convirtiendo byte[] to Date");
		}
	}

}
