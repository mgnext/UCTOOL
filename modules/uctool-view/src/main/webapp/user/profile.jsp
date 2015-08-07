<%@include file="/WEB-INF/jspf/Head.jspf" %>
<%@include file="/WEB-INF/jspf/Header.jspf" %>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h3>User Profiles</h3>
            <hr/>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="inputName" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="email" class="form-control" id="inputName" placeholder="Start typing the name" autocomplete="off">
                        <p class="help-block"> ( First name, Last name ) </p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputDirectory" class="col-sm-3 control-label">Directory Number</label>
                    <div class="col-sm-9">
                        <input type="password" class="form-control" id="inputDirectory" placeholder="#TB234" autocomplete="off">
                        <p class="help-block">Some help text if needed</p>
                    </div>
                </div>

                <h4>Devices</h4>
                <hr>
                <div class="form-group">
                    <label for="inputDevice" class="col-sm-3 control-label">Device</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputDevice">
                            <option value="one">Phone1 - SCP7595</option>
                            <option value="one">Phone2 - SCP6778</option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputMobilityType" class="col-sm-3 control-label">Mobility Type</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityType">
                            <option value="iPhone">iPhone</option>
                            <option value="Tablet">Tablet</option>
                        </select>
                        <p class="help-block"></p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputMobilityProfle" class="col-sm-3 control-label">Mobility Profle</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="inputMobilityProfle">
                            <option value="Profile_1">Profile 1</option>
                            <option value="Profile_2">Profile 2</option>
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
            serviceUrl: '../getUserByName',
            transformResult: function (response) {
                console.log(response);
                x = response;
                console.log(response.suggestions);
                return {
                    suggestions: $.map(response.suggestions, function (dataItdem) {
                        console.log(dataItdem);
                        return {value: dataItem.lastName, data: dataItem};
                    })
                };
            },
            onSelect: function (suggestion) {
                alert('You selected: ' + suggestion.value + ', ' + suggestion.data);
            }
        });
    });


</script>
<%@include file="/WEB-INF/jspf/Foot.jspf" %>


