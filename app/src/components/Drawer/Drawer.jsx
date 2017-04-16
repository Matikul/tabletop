import React from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import DrawerHeader from "./DrawerHeader.jsx";
import DrawerNavigation from "./DrawerNavigation.jsx";
import "./Drawer.scss";

const propTypes = {
    user: PropTypes.shape({
        name: PropTypes.string.isRequired,
        avatar: PropTypes.string.isRequired
    })
};

const defaultProps = {
    user: null
};

const mapStateToProps = ({ user }) => ({
    user
});

export const Drawer = ({ user }) => (
    <div className="drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
        <DrawerHeader
            user={user}
        />
        <DrawerNavigation />
    </div>
);

Drawer.propTypes = propTypes;
Drawer.defaultProps = defaultProps;

export default connect(mapStateToProps)(Drawer);
