define(["codemirror", "codemirror/addon/mode/simple"], function(CodeMirror, SimpleMode) {
	var keywords = "addOutline|black|blank|blue|brown|charcoal|circle|darkBlue|darkBrown|darkGray|darkGreen|darkGrey|darkOrange|darkPurple|darkRed|darkYellow|dashed|degrees|dotdash|dotted|else|filled|gray|green|grey|hotPink|if|lightBlue|lightBrown|lightCharcoal|lightGray|lightGreen|lightGrey|lightOrange|lightPurple|lightRed|lightYellow|longdash|move|myShapes|ngon|not|orange|outlined|oval|pink|polygon|purple|rect|red|rotate|roundedRect|scale|scaleX|scaleY|solid|square|text|then|time|wedge|white|yellow";
	CodeMirror.defineSimpleMode("xtext/oe", {
		start: [
			{token: "comment", regex: "\\/\\/.*$"},
			{token: "comment", regex: "\\/\\*", next : "comment"},
			{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
			{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
			{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
			{token: "lparen", regex: "[\\[(]"},
			{token: "rparen", regex: "[\\])]"},
			{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
		],
		comment: [
			{token: "comment", regex: ".*?\\*\\/", next : "start"},
			{token: "comment", regex: ".+"}
		],
		meta: {
			dontIndentStates: ["comment"],
			lineComment: "//"
		}
	});
});
