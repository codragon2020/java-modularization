package com.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sorting.utl.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Jason", "Adam", "Fred", "Amanda"));
		logger.info(sorted.toString());
	}
}
