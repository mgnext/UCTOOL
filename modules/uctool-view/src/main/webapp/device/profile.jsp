<%@include file="/WEB-INF/jspf/Head.jspf" %>
<%@include file="/WEB-INF/jspf/Header.jspf" %>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h3>Device Profiles</h3>
            <hr/>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">Product Type</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputDirectory" class="col-sm-3 control-label">Protocol</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputDirectory" placeholder="" autocomplete="off">
                        <p class="help-block"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputDirectory" class="col-sm-3 control-label">Profile Name</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputDirectory" placeholder="" autocomplete="off">
                        <p class="help-block"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputDirectory" class="col-sm-3 control-label">Description</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputDirectory" placeholder="" autocomplete="off">
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">Phone Button Template</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">DND</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">MLPP Indication</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one">Default</option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">MLPP Preemption</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one">Default</option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <h3>Associated Line Informations</h3>
                <hr>
                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">Directory Number</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputMobilityType" class="col-sm-3 control-label">Route Pattern</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityType">
                            <option value="iPhone"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputMobilityProfle" class="col-sm-3 control-label">Associated Devices</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityProfle">
                            <option value="Profile_1"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputMobilityProfle" class="col-sm-3 control-label">Voice mail Profile</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityProfle">
                            <option value="Profile_1"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputMobilityProfle" class="col-sm-3 control-label">Calling Search Space</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityProfle">
                            <option value="Profile_1"></option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>


                <button type="button" class="btn btn-warning">Cancle</button>
                <button type="submit" class="btn btn-default">OK</button>
            </form>
        </div>
    </div>
</div>

<br>
<%@include file="/WEB-INF/jspf/Footer.jspf" %>
<%@include file="/WEB-INF/jspf/Scripts.jspf" %>
<script>
    $(function () {
        console.log("jkhask");
        $('#inputName').autocomplete({
            serviceUrl: 'getUserByName',
            onSelect: function (suggestion) {
                alert('You selected: ' + suggestion.value + ', ' + suggestion.data);
            }
        });
    });


</script>
<%@include file="/WEB-INF/jspf/Foot.jspf" %>