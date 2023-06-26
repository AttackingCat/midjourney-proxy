package com.github.novicezk.midjourney.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@ApiModel("缩放提交参数")
@EqualsAndHashCode(callSuper = true)
public class SubmitZoomOutDTO extends BaseSubmitDTO {

	@ApiModelProperty(value = "任务ID", required = true, example = "\"1320098173412546\"")
	private String taskId;

	@ApiModelProperty(value = "1.5; 2.0; 背景扩大倍数", required = true,
			allowableValues = "1.5, 2.0", example = "1.5")
	private Double magnification;
}
